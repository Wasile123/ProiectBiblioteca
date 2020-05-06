package biblioteca.repository.repoMock;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncrementalTopDownTest {
    public IntegrationBigBangTest ibbTest = new IntegrationBigBangTest();
    public CartiRepoMockTest cartiRepoMockTest = new CartiRepoMockTest();


    @Test
    public void PwithA() {
        cartiRepoMockTest.adaugaCarteHAPPYF01();
        ibbTest.caseP();
    }

    @Test
    public void PwithAandB() {
        cartiRepoMockTest.adaugaCarteHAPPYF01();
        cartiRepoMockTest.cautaDupaTitluTestHAPPYF02();
        ibbTest.caseP();
    }

    @Test
    public void PwithAandBandC() {
        cartiRepoMockTest.adaugaCarteHAPPYF01();
        cartiRepoMockTest.cautaDupaTitluTestHAPPYF02();
        cartiRepoMockTest.getCartiOrdonateDinAnulHAPPYF03();
        ibbTest.caseP();
    }
}