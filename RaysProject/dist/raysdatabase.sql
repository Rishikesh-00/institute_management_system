  create user rays identified by soft
/

grant dba to rays
/

conn rays/soft
/
create table signup
( role number (1) ,
Uname varchar(150),
u_id varchar(150)  ,
sec_qus varchar(300),
sec_ans varchar(250) ,
pas varchar(200) 
)
/
create table registration
(
    reg_no varchar(150),
    reg_date varchar(100),
    sname varchar(200),
    fname varchar(200),
    mname varchar(200),
    sdob varchar(100) ,
    email varchar(150),
    cont_no varchar(15),
    prog varchar(300),
    blood_grp varchar(10),
    clg_name varchar(200),
    gender varchar(10),
    prmt_add varchar(300),
    dis varchar(100),
    stt varchar(300),
    sphoto blob,
    aadhar blob,
    cor_add varchar(300)
)
 /
 create table certificate
 (
    cref_no varchar(50) ,
    cer_date varchar(40) ,
    reg_no varchar(50)  ,
    sub varchar(200) ,
    sname varchar (200) ,
    cduration varchar(100) ,
    fname varchar(200) ,
    dob varchar(50)
 )
 /
 create table admission 
 (
    adm_no varchar(50) ,
    adm_date varchar(50),
    reg_no varchar(30) ,
    cou_apply varchar(300) ,
    fee varchar(30) ,
    dis varchar(150)  
 )
 /
 create table course
 (
    cid varchar(25),
    cname varchar(150),
    cdur varchar(150),
    cfee varchar(12)
 )
/
create table money_receipt
(
    recpt_no varchar(150),
    rdate varchar(25),
    aform_no varchar(150),
    cash varchar(20),
    upi varchar(20),
    cheque varchar(20),
    dd varchar(20),
    dues_amt varchar(15) ,
    ins_date varchar(50) ,
    rec_from varchar(200) ,
    reg_no varchar(150)
)
/
create table branch_details(
   bcode varchar (25),
   bname varchar (300),
   bcont_pr varchar(200),
   email varchar(150),
   badd varchar(350),
   phno varchar(50),
   dist varchar(200),
   state1 varchar(200)
)
/
create table state(
   ad number(3),
   ar number(3),
   am number(3),
   br number(3),
   cg number(3),
   dl number(3),
   ga number(3),
   gj number(3),
   hr number(3),
   hp number(3),
   jk number(3),
   jh number(3),
   ka number(3),
   kl number(3),
   ld number(3),
   mp number(3),
   mh number(3),
   mn number(3),
   ml number(3),
   mz number(3),
   nl number(3),
   od number(3),
   py number(3),
   pb number(3),
   rj number(3),
   sk number(3),
   tn number(3),
   ts number(3),
   tr number(3),
   up number(3),
   uk number(3),
   wb number(3),
   an number(3),
   ch number(3),
   dn number(3),
   la number(3)
)
/
create table book_details
(
   reg_no varchar(40),
   sname varchar(300),
   bname varchar(500),
   aname varchar(500),
   pname varchar(500),
   issue_dt varchar(300),
   subm_dt date,
   receice varchar(500)
)
/
create table automatic 
(
   reg_no number(20),
   adm_no number(20),
   cid number(20) ,
   recpt_no number(20),
   ch varchar(20) 
)
/
create table blood_grp(
   bg varchar(150)
)
/
insert into automatic values(
  0,0,0,0,'A'
)
/
insert into state values(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
/
insert into blood_grp values('A')
/
insert into blood_grp values('B')
/
insert into blood_grp values('AB')
/
insert into blood_grp values('O')
/
insert into blood_grp values('A-')
/
insert into blood_grp values('B-')
/
insert into blood_grp values('AB-')
/
commit;
