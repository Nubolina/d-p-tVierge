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
        if(parameters.length < 4 ) document.remplacer(debut,fin,""); else {document.remplacer(debut,fin,parameters[3]);}
        super.executer();
    }

}
