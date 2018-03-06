float ballX=5;
int ballY=1;
int score=0;
void setup(){
  size(500, 500) ; 
}
void draw(){
  background(5, 5, 70);
  ellipse(ballX, ballY, 10, 20);
  fill(70, 70, 200);
  stroke(80, 70, 210);
  ballY+=10;
  rect(mouseX, 450, 40, 50);
  if (ballY>=500){
   ballY=1;
   ballX=random(5,495);
   checkCatch(ballX);
  }
  }
  void checkCatch(float ballX){
if (ballX > mouseX && ballX < mouseX+40 && ballY==450){
      score++;
}
   else{
     score--;
}
println("Your score is now: "+score);
  } 