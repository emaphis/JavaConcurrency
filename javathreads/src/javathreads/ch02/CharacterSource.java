package javathreads.ch02;

/**
 * A source of characters for game
 * @author emaph
 */
public interface CharacterSource {
    public void addCharacterListener(CharacterListener cl);
    public void removeCharacterListener(CharacterListener cl);
    public void nextCharacter();
}
