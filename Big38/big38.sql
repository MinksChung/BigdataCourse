create database movie;

CREATE TABLE movielist (
  id int(11) NOT NULL primary key auto_increment,
  title varchar(100) NOT NULL,
  director varchar(100) NOT NULL,
  content varchar(100) DEFAULT NULL,
  posterimg varchar(100) DEFAULT NULL
);

insert into movielist values ("about미국","김갑동","이것이 미국입니다.","american.jpg");
insert into movielist values ("how to ccok","엄순영","요리조리 요리","cook.jpg");
insert into movielist values ("about naver","고수군","네이버에 입사하는 방법","naver.jpg");
insert into movielist values ("코딩이 제일 쉬웠어요","임정통","비전공자 코딩하는법","code.jpg");
insert into movielist values ("hoem","정병수","집에가고 싶어요...","home.jpg");