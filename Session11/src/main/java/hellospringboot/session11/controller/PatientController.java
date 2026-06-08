package hellospringboot.session11.controller;

import hellospringboot.session11.dto.PatientRequest;
import hellospringboot.session11.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public String addPatient(@RequestBody PatientRequest request) {
        return patientService.addPatient(request);
    }
}
