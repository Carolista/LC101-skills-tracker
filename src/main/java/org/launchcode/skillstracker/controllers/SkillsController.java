package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {

    @GetMapping("/")
    public String startPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>We have a few skills we would like to learn. Here is the list!</h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorites.</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form") // I am not putting this into a table (bonus part one) because NO.
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/results' method='post'>" +
                "<label id='name'>Name: </label>" +
                "<input type='text' name='name' /><br>" +
                "<label id='first'>My favorite language: </label>" +
                "<select name='firstfave'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label id='second'>My 2nd favorite language: </label>" +
                "<select name='secondfave'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label id='third'>My 3rd favorite language: </label>" +
                "<select name='thirdfave'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("/results") // Bonus part two - send to separate page
    public String skillsOutput(@RequestParam String name, String firstfave, String secondfave, String thirdfave) {

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstfave + "</li>" +
                "<li>" + secondfave + "</li>" +
                "<li>" + thirdfave + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
