import java.util.*;
public class HiddenWord
{
    private String word;
    public HiddenWord(String word)
    {
        this.word = word;
    }

    public String getHint(String hint)
    {
        String givenHint = "";
        if(hint.equals(word))
        {
            givenHint = word;
        }

        if(hint != word)
        {
            for(int i = 0; i < word.length(); i++)
            {
                if(hint.charAt(i) == (word.charAt(i)))
                {
                    givenHint = givenHint + hint.charAt(i);
                }
                else if(word.indexOf(hint.charAt(i)) > 0)
                {
                    givenHint = givenHint + "+";
                }
                else if(hint.charAt(i) != (word.charAt(i)))
                {
                    givenHint = givenHint + "*";
                }
            }
        }
        return givenHint;
    }

    public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}