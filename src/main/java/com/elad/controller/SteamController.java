package com.elad.controller;

import com.elad.data.StreamStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by eladw on 5/7/18.
 */
@RestController
public class SteamController {

    private static final Logger logger = LoggerFactory.getLogger(SteamController.class);
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/start-stream")
    @ResponseBody
    public StreamStatus startStream(@RequestParam(name="name", required=true) String name) {
        logger.info("recv startStream req with name={}, counter={}", name, counter);
        return new StreamStatus(counter.incrementAndGet(), name,"running", "content default");
    }


    @GetMapping("/stop-stream")
    @ResponseBody
    public StreamStatus stopStream(@RequestParam(name="name", required=true) String name) {
        logger.info("recv stopStream req with name={}, counter={}", name, counter);
        return new StreamStatus(counter.incrementAndGet(), name,"close", "content default");
    }


}
