
package javathreads.ch02;

/**
 *
 * @author emaph
 */
public class CharacterEvent {
    public CharacterSource source;
    public int character;

    public CharacterEvent(CharacterSource cs, int chr) {
        this.source = cs;
        this.character = chr;
    }
}
