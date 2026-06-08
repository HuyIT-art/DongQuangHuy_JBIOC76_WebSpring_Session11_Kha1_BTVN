package hellospringboot.session11.service;

import hellospringboot.session11.dto.PatientRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientService {

    public String addPatient(PatientRequest request) {

        log.info("Đã tiếp nhận bệnh nhân: {}", request.getName());

        if (request.getAge() > 120) {
            log.warn("Tuổi bệnh nhân bất thường: {}", request.getAge());
        }

        return "Thêm bệnh nhân thành công";
    }
}