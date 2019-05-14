INSERT INTO users(email, password) VALUES ("cjswo9207@naver.com", "1234");
INSERT INTO users(email, password) VALUES ("yun9295@gmail.com", "1234");

INSERT INTO boards(users_id, title, content) VALUES (1, "첫번째 글입니다.", "첫번째 글의 내용입니다.");
INSERT INTO boards(users_id, title, content) VALUES (3, "두번째 글입니다.", "두번째 글의 내용입니다.");

INSERT INTO roles(role) VALUES ("admin");
INSERT INTO roles(role) VALUES ("cutomer");