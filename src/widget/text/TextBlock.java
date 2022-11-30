package src.widget.text;
import java.awt.Point;

public class TextBlock {
  
    // Instance fields
     
    private Point _position;
    private Point _offset;
    
    private String _content; // text
    
    private int _caseSize;
    private int _caseColor;
    
    // Constructors
    
    public TextBlock(String content, Point position, Point offset) {
      setContent(content);
      setPosition(position);
      setOffset(offset);
      setCaseSize(24);
    }
    
    public TextBlock(String content, Point position, Point offset, int caseColor) {
      setContent(content);
      setPosition(position);
      setCaseColor(caseColor);
      setOffset(offset);
      setCaseSize(24);
    }
    
    public TextBlock(String content, Point position, Point offset, int caseColor, int caseSize) {
      setContent(content);
      setPosition(position);
      setCaseColor(caseColor);
      setOffset(offset);
      setCaseSize(caseSize);
      
    }
    
    // Getters
    
    public Point getPosition(){
      return this._position;
    }
    
    public String getContent(){
      return this._content;
    }
    
    public int getCaseSize(){
      return this._caseSize;
    }
    
    public color getCaseColor(){
      return this._caseColor;
    }
    
    public Point getOffset() {
       return this._offset; 
     }
    
    // Setters
    
    public void setPosition(Point value){
      this._position = value;
    }
    
    public void setContent(String value){
      this._content = value;
    }
    
    public void setCaseSize(int value){
      this._caseSize = value;
    }
    
    public void setCaseColor(int value){
      this._caseColor = value;
    }
    
    protected void setOffset(Point value) {
       this._offset = value;
     }
     
    // Class methods
    
    public void draw(){
      GameManager.getSketch().noStroke();
      GameManager.getSketch().fill(getCaseColor());
      textFont(GameManager.getSketch().gameManager.getGUI().getFont(1), getCaseSize());
      int placementX = getOffset().x + getPosition().x;
      int placementY = getOffset().y + getPosition().y;
      GameManager.getSketch().text(getContent(), placementX, placementY);
    }  
     
   }