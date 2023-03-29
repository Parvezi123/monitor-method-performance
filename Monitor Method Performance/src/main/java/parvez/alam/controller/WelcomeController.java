package parvez.alam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import parvez.alam.service.WelcomeService;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    @GetMapping
    public ResponseEntity<String> observedWelcome(@RequestParam("name") String name) {
        return ResponseEntity.ok(welcomeService.welcomeWithObserver(name));
    }

    @GetMapping("/noobserve")
    public ResponseEntity<String> noObserveWelcome(@RequestParam("name") String name) {
        return ResponseEntity.ok(welcomeService.welcomeWithoutOutObserver(name));
    }
}
