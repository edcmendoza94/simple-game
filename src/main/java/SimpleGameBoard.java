public class SimpleGameBoard extends GameBoard {
    public SimpleGameBoard() {
        super();
        Cell blueOne = new PropertyCell();
        Cell blueTwo = new PropertyCell();
        Cell greenOne = new PropertyCell();
        Cell greenTwo = new PropertyCell();
        Cell greenThree = new PropertyCell();

        blueOne.setName("Blue One");
        blueTwo.setName("Blue Two");
        greenOne.setName("Green One");
        greenTwo.setName("Green Two");
        greenThree.setName("Green Three");

        addCell(blueOne);
        addCell(blueTwo);
        addCell(greenOne);
        addCell(greenTwo);
        addCell(greenThree);
    }
}
