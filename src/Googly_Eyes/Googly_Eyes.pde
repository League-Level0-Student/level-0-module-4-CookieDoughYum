void setup(){
  PImage face = loadImage("download.jpg");
  size(800,600);
   face.resize(800, 600);
   background(face);
   
  
}
void draw(){
  if(mousePressed){
     System.out.println(mouseX+" "+mouseY);
   }
  //Left Eye
   
   
   if(mouseX<100){
     mouseX=100;
   }
   if(mouseX>139){
     mouseX=139;
   }
   if(mouseY>281){
     mouseY=281;
   }
   if(mouseY<230){
     mouseY=279;
   }
   ellipse(117, 256, 70, 70);
 fill(#120202);
  ellipse(mouseX, mouseY, 20, 20);
   fill(#FCFCFC);
   
   // Right Eye
   
    if(mouseX<100){
     mouseX=100;
   }
   if(mouseX>139){
     mouseX=139;
   }
   if(mouseY>281){
     mouseY=281;
   }
   if(mouseY<230){
     mouseY=279;
   }
   ellipse(300, 256, 70, 70);
 fill(#120202);
  ellipse(mouseX, mouseY, 20, 20);//change right pupil
   fill(#FCFCFC);
   
}