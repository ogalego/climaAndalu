/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.bayes.NaiveBayesMultinomial;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.meta.MultiClassClassifier;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.trees.RandomTree;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author migue
 */
public class PracticaWeka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracticaWeka pw = new PracticaWeka();
        pw.createClassifyer();
        pw.aplicar();
    }
    
    public void createClassifyer() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("clima.arff"));
            Instances instancia = new Instances(fr);
            instancia.setClassIndex(8);
            Classifier mp = new RandomTree(); 
            mp.buildClassifier(instancia);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("climaModel.model"));
            oos.writeObject(mp);
            oos.flush();
            oos.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaWeka.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PracticaWeka.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PracticaWeka.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(PracticaWeka.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void aplicar() {
        try {
            String[] valoresAtributos = {"yuebe", "no yuebe"};
            Classifier clasificador  = (Classifier) weka.core.SerializationHelper.read("climaModel.model");
            ConverterUtils.DataSource source = new ConverterUtils.DataSource("pruebaClima.arff");
            Instances data = source.getDataSet();
            data.setClassIndex(9);
            for (int i = 0; i < data.size(); i++) {
                System.out.println(valoresAtributos[ (int) clasificador.classifyInstance(data.instance(i))]);
            }
        } catch (Exception ex) {
            Logger.getLogger(PracticaWeka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
