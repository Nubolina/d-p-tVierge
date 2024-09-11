package fr.iut.editeur.document;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DocumentTest {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour!");
        assertEquals("Bonjour!", document.getTexte());
        document.ajouter(" Quentin xD");
        assertEquals("Bonjour! Quentin xD", document.getTexte());
    }

}
