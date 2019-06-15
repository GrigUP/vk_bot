package ru.grig.vk_bot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/confirm")
public class ConfirmController {

    @PostMapping("/")
    public ResponseEntity<?> confirm(@RequestBody Confirm.ConfirmRequest request) {
        return ResponseEntity.ok("8b93bcfc");
    }

}
