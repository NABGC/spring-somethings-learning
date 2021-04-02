package com.nabgc.sampleapp.web.controller.mediatypes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nabgc.sampleapp.web.dto.nabgcItem;
import com.nabgc.sampleapp.web.dto.nabgcItemV2;

@RestController
@RequestMapping(value = "/", produces = "application/vnd.nabgc.api.v1+json")
public class CustomMediaTypeController {

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.nabgc.api.v1+json")
    public @ResponseBody nabgcItem getItem(@PathVariable("id") String id) {
        return new nabgcItem("itemId1");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.nabgc.api.v2+json")
    public @ResponseBody nabgcItemV2 getItemSecondAPIVersion(@PathVariable("id") String id) {
        return new nabgcItemV2("itemName");
    }
}
