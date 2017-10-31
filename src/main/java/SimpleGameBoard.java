public class SimpleGameBoard extends GameBoard {
    public SimpleGameBoard() {
        super();
        Cell blueOne = new PropertyCell();
        Cell blueTwo = new PropertyCell();

        blueOne.setName("Blue One");
        blueTwo.setName("Blue Two");

        addCell(blueOne);
        addCell(blueTwo);
    }
}
