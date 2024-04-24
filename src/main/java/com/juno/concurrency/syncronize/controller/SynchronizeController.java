package com.juno.concurrency.syncronize.controller;

import com.juno.concurrency.syncronize.domain.dto.RequestDto;
import com.juno.concurrency.syncronize.service.SynchronizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/synchronize")
@RequiredArgsConstructor
public class SynchronizeController {
    private final SynchronizeService synchronizeService;
    @PostMapping("")
    public String post(@RequestBody RequestDto requestDto) {
        synchronizeService.post(requestDto);
        return "post";
    }
}
