package biblioteca.repository.repoMock;

import biblioteca.model.Carte;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IntegrationBigBangTest {
    private List<Carte> cartiList = new ArrayList<Carte>();
    private CartiRepoMock cartiRepoMock = new CartiRepoMock();

    @Test
    public void adaugaCarteHAPPYF01() {
        cartiList = cartiRepoMock.getCarti();
        Carte c = Carte.getCarteFromString("Povesti;Mihai Eminescu,Ion Caragiale,Ion Creanga;1973;Corint;povesti,povestiri");
        cartiRepoMock.adaugaCarte(c);
        assertEquals(7, cartiList.size());

        Carte c2 = Carte.getCarteFromString("Povesti;Mihai Eminescu,Ion Caragiale,Ion Creanga;1973;Corint;povesti,povestiri");
        cartiRepoMock.adaugaCarte(c2);
        Carte c3 = Carte.getCarteFromString("Povesti;Mihai Eminescu,Ion Caragiale,Ion Creanga;1973;Corint;povesti,povestiri");
        cartiRepoMock.adaugaCarte(c3);
        assertEquals(9, cartiList.size());

        Carte c4 = Carte.getCarteFromString("Povesti;Mihai Eminescu,Ion Caragiale,Ion Creanga;1973;Corint;povesti,povestiri");
        cartiRepoMock.adaugaCarte(c4);
        Carte c5 = Carte.getCarteFromString("Povesti;Mihai Eminescu,Ion Caragiale,Ion Creanga;1973;Corint;povesti,povestiri");
        cartiRepoMock.adaugaCarte(c5);
        assertEquals(11, cartiList.size());

    }


    @Test
    public void cautaDupaTitluTestHAPPYF02() {
        cartiList = cartiRepoMock.getCarti();

        assertEquals(cartiList.get(5), cartiRepoMock.cautareDupaTitlu("Test"));
        assertNotEquals(cartiList.get(4), cartiRepoMock.cautareDupaTitlu("Test"));
    }


    @Test
    public void getCartiOrdonateDinAnulHAPPYF03() {
        String anul = "1948";
        List<Carte> temp = new ArrayList<Carte>();
        cartiList = cartiRepoMock.getCarti();

        temp.add(cartiList.get(3));
        temp.add(cartiList.get(2));
        temp.add(cartiList.get(4));
        assertEquals(temp, cartiRepoMock.getCartiOrdonateDinAnul(anul));

    }

    @Test
    public void caseP() {
        adaugaCarteHAPPYF01();
        cautaDupaTitluTestHAPPYF02();
        getCartiOrdonateDinAnulHAPPYF03();
    }

}