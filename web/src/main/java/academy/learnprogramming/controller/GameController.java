package academy.learnprogramming.controller;

import academy.learnprogramming.service.GameService;
import academy.learnprogramming.util.AttributeName;
import academy.learnprogramming.util.GameMapping;
import academy.learnprogramming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class GameController {

//    failds

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService=gameService;
    }

//    request methods

    @GetMapping(GameMapping.PLAY)
    public String play(Model model){
        model.addAttribute(AttributeName.MAIN_MESSAGE,gameService.getMainMessage());
        model.addAttribute(AttributeName.RESULT_MESSAGE,gameService.getResultMessage());

        log.info("model ={}",model);

        if(gameService.isGameOver()){
            return ViewNames.GAME_OVER;
        }
        return ViewNames.PLAY;
    }

    @PostMapping(GameMapping.PLAY)
    public String processMessage(@RequestParam int guess){
        log.info("guess = {}",guess);
        gameService.checkGuess(guess);
        return GameMapping.REDIRECT_PLAY;
    }

}














