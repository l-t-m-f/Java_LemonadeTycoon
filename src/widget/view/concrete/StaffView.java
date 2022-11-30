package src.widget.view.concrete;
class StaffView extends View {

  public StaffView(GraphicLook graphics, Point offset) {
    super("Staff", graphics, offset);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] { new ButtonCommandNothing(), new ButtonCommandNothing(), new ButtonCommandNothing() });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    GraphicLook graphicLook = new GraphicLook(new Point(0, 0), new Dimension(250, 200), color(200, 0, 55));
    Point offset = new Point(getOffset().x + 100, getOffset().y + 196);
    addSubview(new StaffView_hireProfile(graphicLook, offset));
  }

  @Override
  protected void createButtons() {
    addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
            new Point(60 + getOffset().x, 156 + getOffset().y),
            getButtonCommands()[0]));
    addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
            new Point(412 + getOffset().x, 156 + getOffset().y),
            getButtonCommands()[1]));
    addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(120, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
            new Point(310 + getOffset().x, 260 + getOffset().y),
            getButtonCommands()[2]));
  }

}