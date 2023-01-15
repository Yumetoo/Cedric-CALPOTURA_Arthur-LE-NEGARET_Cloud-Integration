package test;

public class CharacterLeveling {
    public CharacterLeveling() {
    }

    public MyCharacter myArea(MyCharacter MyCharacter) {
        MyCharacter.toString();
        MyCharacter character = new MyCharacter();
        character.setName(MyCharacter.getName());
        character.setClassName(MyCharacter.getClassName());
        character.setLevel(MyCharacter.getLevel());
        String currentArea = MyCharacter.getArea();
        if (MyCharacter.getLevel() == 1 && !currentArea.equals("Beginner Zone")) {
            character.setArea("Beginner Zone");
        } else if (MyCharacter.getLevel() >= 2 && MyCharacter.getLevel() <= 10 && !currentArea.equals("Intermediate Zone")) {
            character.setArea("Intermediate Zone");
        } else if (MyCharacter.getLevel() > 10 && MyCharacter.getLevel() <= 20 && !currentArea.equals("Advanced Zone")) {
            character.setArea("Advanced Zone");
        } else if (MyCharacter.getLevel() > 20 && !currentArea.equals("Expert Zone")) {
            character.setArea("Expert Zone");
        }
        return character;
    }
}