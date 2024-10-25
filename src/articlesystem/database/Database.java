package articlesystem.database;

import articlesystem.model.Article;
import articlesystem.model.Author;
import articlesystem.model.Category;
import articlesystem.model.Moderator;
import articlesystem.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Article> articles = new ArrayList<>();
    public static List<Category> categories = new ArrayList<>();
    public static List<Tag> tags = new ArrayList<>();
    public static List<Author> authors = new ArrayList<>();
    public static List<Moderator> moderators = new ArrayList<>();
}
