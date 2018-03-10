
float ballX=255;
int ballY=1;
int score=0;
void setup(){
  size(500, 500) ; 
}
void draw(){
  background(5, 5, 70);
    fill(70, 70, 200);
  ellipse(ballX, ballY, 10, 20);
  stroke(80, 70, 210);
  ballY+=10;
  fill(250, 30, 30);
  rect(mouseX, 450, 40, 50);
text(""+score, 10, 10, 70, 80);
  if (ballY>=500){
   ballY=1;
      checkCatch(ballX);
   ballX=random(15,485);
 }
  }
  void checkCatch(float ballX){
if (ballX+10 > mouseX && ballX < mouseX+50){
      score++;
}
   else{
     score--;
}
println("Your score is now: "+score);
  } 