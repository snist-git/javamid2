import java.applet.*;
import java.awt.*;

public class w122 extends Applet
{
  public void paint(Graphics g)
  {
     g.drawString("This is a message.",150,150);
  }
}

/* HTML Code : Save this file as test.html

<html>
<body>
<applet code="w122.class" width=300 height=300>
</applet>
</body>
</html>

*/

/* Steps

1. javac w122.java
2. appletviewer test.html

*/
