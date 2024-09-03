package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        if(parameters[3]==null) parameters[3]="";
        document.remplacer(debut,fin,parameters[3]);
        super.executer();
    }

//    @Override
//    public void executer() {
//        if(parameters.length < 2) {
//            System.err.println("Format attendu : ajouter;texte");
//            return;
//        }
//        String texte = parameters[1];
//        this.document.ajouter(texte);
//        super.executer();
//    }
}
