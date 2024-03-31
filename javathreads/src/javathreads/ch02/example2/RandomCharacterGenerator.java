package javathreads.ch02.example2;

import java.util.*;
import javathreads.ch02.*;

/**
 * Our first thread
 * @author emaph
 */
public class RandomCharacterGenerator extends Thread implements CharacterSource {
    static char[] chars;
    static final String charArray = "abcdefghijklmnopqrstuvwxyz0123456789";
    static {
        chars = charArray.toCharArray();
    }

    Random random;
    CharacterEventHandler handler;

    public RandomCharacterGenerator() {
        this.random = new Random();
        this.handler = new CharacterEventHandler();
    }

    public int getPauseTime() {
        return (int) (Math.max(1000, 5000 * random.nextDouble()));
    }

    @Override
    public void addCharacterListener(CharacterListener cl) {
        handler.addCharacterListener(cl);
    }

    @Override
    public void removeCharacterListener(CharacterListener cl) {
        handler.removeCharacterListener(cl);
    }

    @Override
    public void nextCharacter() {
        handler.fireNewCharacter(this, (int) chars[random.nextInt(chars.length)]);
    }

    @Override
    public void run() {
        for (;;) {
            nextCharacter();
            try {
                Thread.sleep(getPauseTime());
            } catch (InterruptedException ie) {
                return;
            }
        }
    }
}

