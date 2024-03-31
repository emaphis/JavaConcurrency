
package javathreads.ch02;

import java.util.*;

/**
 * A class that fires CharacterEvents when appropriate.
 * @author emaph
 */
public class CharacterEventHandler {
    private Vector<CharacterListener> listeners = new Vector<CharacterListener>();

    public void addCharacterListener(CharacterListener cl) {
        listeners.add(cl);
    }

    public void removeCharacterListener(CharacterListener cl) {
        listeners.remove(cl);
    }

    public void fireNewCharacter(CharacterSource source, int chr) {
        CharacterEvent ce = new CharacterEvent(source, chr);
        CharacterListener[] cl =
                (CharacterListener[]) listeners.toArray(new CharacterListener[0]);
        for (CharacterListener cl1 : cl) {
            cl1.newCharacter(ce);
        }
    }
}
