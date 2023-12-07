package jellal.mohamed.dam.mp05.uf1.p02.serialitzacio.binaria.model.service;

import java.io.IOException;
import java.util.List;

import jellal.mohamed.dam.mp05.uf1.p02.serialitzacio.binaria.model.configuration.Settings;
import jellal.mohamed.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain.Cotxe;
import jellal.mohamed.dam.mp05.uf1.p02.serialitzacio.binaria.model.repository.CotxeSerialitzacioRepository;

public class CotxeSerialitzacioBinariaService {

    private static CotxeSerialitzacioBinariaService instance = null;

    private CotxeSerialitzacioBinariaService() {
    }

    public static CotxeSerialitzacioBinariaService getInstance() {
        if (instance == null) {
            instance = new CotxeSerialitzacioBinariaService();
        }
        return instance;
    }

    public void serialitzaUnCotxe(Cotxe cotxe) throws IOException {
        CotxeSerialitzacioRepository rep = CotxeSerialitzacioRepository.getInstance();
        rep.serialitzaUnCotxe(cotxe, Settings.FITXER_COTXE_INDIVIDUAL);
    }

    public void serialitzaLlistaCotxes(List<Cotxe> cotxes) throws IOException {
        CotxeSerialitzacioRepository rep = CotxeSerialitzacioRepository.getInstance();
        rep.serialitzaLlistaCotxes(cotxes, Settings.FITXER_LLISTA_COTXES);
    }

    public Cotxe deserialitzaUnCotxe() throws IOException, ClassNotFoundException {
        CotxeSerialitzacioRepository rep = CotxeSerialitzacioRepository.getInstance();
        return rep.deserialitzaUnCotxe(Settings.FITXER_COTXE_INDIVIDUAL);
    }

    public List<Cotxe> deserialitzaLlistaCotxes() throws IOException, ClassNotFoundException {
        CotxeSerialitzacioRepository rep = CotxeSerialitzacioRepository.getInstance();
        return rep.deserialitzaLlistaCotxes(Settings.FITXER_LLISTA_COTXES);
    }
}
