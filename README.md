# SOLID-L-
SOLID Principle example project (L)

### What is Liskov Substitution Principle?
- "S is a subtype of T, then objects of type T may be replaced with objects of type S"
- Derived types must be completely substitutable for their base types
- Liskov substitution principle (LSP) is a particular definition of subtyping relation, called (strong) behavioral subtyping
- Extension of the Open Close Principle
- Introduced by Barbara Liskov
<img src="http://news.mit.edu/sites/mit.edu.newsoffice/files/styles/news_article_image_top_slideshow/public/images/2009/20091222102310-0_0.jpg" />

### Implementation Guidelines
- No new exceptions can be thrown by the subtype
- Clients should not know which specific subtype they are calling
- New derived classes just extend without replacing the functionality of old classes
