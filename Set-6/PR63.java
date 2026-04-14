public class PR63
{
    public static void main(String[] args) 
    {
        Library L = new Library(3);

        try
        {
            L.issueBook(2);
            L.issueBook(2);
        }
        catch (BookNotAvailableException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class BookNotAvailableException extends Exception
{
    BookNotAvailableException(String msg)
    {
        super(msg);
    }
}

class Library
{
    int availableBooks;

    Library(int books)
    {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException
    {
        if (count <= availableBooks)
        {
            availableBooks = availableBooks - count;
            System.out.println("Book issued successfully");
        }
        else
        {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}