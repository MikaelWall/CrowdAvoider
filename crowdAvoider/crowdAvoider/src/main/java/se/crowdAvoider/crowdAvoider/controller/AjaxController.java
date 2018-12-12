package se.crowdAvoider.crowdAvoider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    @ResponseBody
    @RequestMapping
    public AjaxResponseBody getSearchResultViaAjax(@RequestBody SearchCriteria search) {

        AjaxResponseBody result = new AjaxResponseBody();
        //logic
        return result;

    }

}
