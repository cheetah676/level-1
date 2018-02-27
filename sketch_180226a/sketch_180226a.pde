
int ballY=1;void setup(){
  size(500, 500) ; 
}
void draw(){
  background(5, 5, 70);
  ellipse(15, ballY, 10, 20);
  fill(70, 70, 200);
  stroke(80, 70, 210);
  ballY+=10;
  }