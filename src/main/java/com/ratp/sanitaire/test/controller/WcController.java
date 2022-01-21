package com.ratp.sanitaire.test.controller;

import com.ratp.sanitaire.test.service.RatpWcService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class WcController {
    private final RatpWcService ratpWcService;

    public WcController(RatpWcService ratpWcService) {
        this.ratpWcService = ratpWcService;
    }

    @GetMapping("/wc")
    @Validated
    public ResponseEntity<Object> getWcByLine(@RequestParam("line") String lineId) {
        return ResponseEntity.ok(ratpWcService.getWcByLine(lineId));
    }
}
