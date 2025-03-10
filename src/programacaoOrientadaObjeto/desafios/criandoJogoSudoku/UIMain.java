package programacaoOrientadaObjeto.desafios.criandoJogoSudoku;

import static java.util.stream.Collectors.toMap;

import java.util.stream.Stream;

import programacaoOrientadaObjeto.desafios.criandoJogoSudoku.ui.custom.screen.MainScreen;

public class UIMain {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        var mainsScreen = new MainScreen(gameConfig);
        mainsScreen.buildMainScreen();
    }

}
