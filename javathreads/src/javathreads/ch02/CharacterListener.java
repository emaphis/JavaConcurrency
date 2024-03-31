
package javathreads.ch02;

/**
 * A listener that can register with a particular source and be notified
 * when a new character is available
 * @author emaph
 */
public interface CharacterListener {
    public void newCharacter(CharacterEvent ce);
}
