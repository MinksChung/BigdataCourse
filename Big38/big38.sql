create database movie;

CREATE TABLE movielist (
  id int(11) NOT NULL primary key auto_increment,
  title varchar(100) NOT NULL,
  director varchar(100) NOT NULL,
  content varchar(100) DEFAULT NULL,
  posterimg varchar(100) DEFAULT NULL
);

insert into movielist values ("about�̱�","�谩��","�̰��� �̱��Դϴ�.","american.jpg");
insert into movielist values ("how to ccok","������","�丮���� �丮","cook.jpg");
insert into movielist values ("about naver","�����","���̹��� �Ի��ϴ� ���","naver.jpg");
insert into movielist values ("�ڵ��� ���� �������","������","�������� �ڵ��ϴ¹�","code.jpg");
insert into movielist values ("hoem","������","�������� �;��...","home.jpg");