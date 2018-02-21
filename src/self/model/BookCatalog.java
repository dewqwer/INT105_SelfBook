/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.model;

/**
 *
 * @author Tisanai.Cha
 */
public class BookCatalog {

    private int numOfBooks;
    private Book[] books;

    public BookCatalog(int lengthOfCatalog) {
        books = new Book[lengthOfCatalog];
    }

    public int size() {
        return books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {
        //add code here
        
        if (this.numOfBooks == books.length) {
            return -1;
        }
        books[numOfBooks]=bookAdded;
        numOfBooks++;
        return numOfBooks - 1;

    }

    public int unAvailableBook(Book bookUnAvailable) {
        //add code here
        int result = -1;
        for (int i = 0; i < books.length; i++) {
            if (bookUnAvailable.equals(books[i])) {
//                books[i].setAvailable(false);
                result = i;

            }
        }
        return result;
    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
