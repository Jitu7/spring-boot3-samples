truncate table bookmarks;
ALTER SEQUENCE bookmarks_id_seq RESTART WITH 1;

insert into bookmarks(title, url, created_at)
values ('Building REST services with Spring', 'https://spring.io/guides/tutorials/rest',
        CURRENT_TIMESTAMP),
       ('Spring Security and Angular', 'https://spring.io/guides/tutorials/spring-security-and-angular-js',
        CURRENT_TIMESTAMP),
       ('React.js and Spring Data REST', 'https://spring.io/guides/tutorials/react-and-spring-data-rest',
        CURRENT_TIMESTAMP)
;