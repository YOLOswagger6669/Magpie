public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf("dog") >= 0
    || statement.indexOf("cat") >= 0)
  {
    response = "Tell me more bout ur animals";
  }
  else if (statement.trim().length()<=0)
  {
    response = "Say something I'm giving up on you";
  }
  else if (statement.indexOf("Mr. Komarinski") >= 0)
  {
   response = "Koma Koma Koma, give me a diploma";
  }
  else if (statement.indexOf("Alex") >= 0)
  {
   response = "Alex is my Nica";
  }
  else if (statement.indexOf("Kyle") >= 0)
  {
   response = "Kyle is boolean";
  }
  else if (statement.indexOf("9") >= 0)
  {
   response = "Boo! Freshmen!";
  }
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
   response = "Koma punches police officers";
  }
  else if (whichResponse == 5)
  {
   response = "In bed";
  }
  return response;
 }
}
