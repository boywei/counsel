# Counsel
##介绍
这是一个社会心理服务热线平台
##术语表
- caller 访客/咨询者
- counselor 咨询师
- supervisor 督导
- admin 管理员
- chat 会话
- message 咨询记录
- binding 绑定关系
- weekday 工作日
- schedule 排班表
- help 求助
- record 求助记录
##数据库设计
###数据库基本信息
name: counsel
url: jdbc:mysql://localhost:3306/counsel 
username: group14  
password: 123456 
###数据表设计
ER图见附件：
- caller(id, phone, name, password, emergency_contact, emergency_number, mark)
- counselor(id, name, gender, age, id_card, phone, email, user_name, password, workplace, position, status)
- supervisor(id, name, gender, age, id_card, phone, email, user_name, password, workplace, position, qualification, qualification_id, status)
- admin(name, password)
- chat(chat_id, caller_id, counselor_id, counsel_time, duration, score, comment_caller, comment_counselor)
- message(message_id, chat_id, sender_id, receiver_id, send_time, type, content, mark)
- binding(counselor_id, supervisor_id)
- schedule(schedule_id, person_id, person_type, weekday)
- help(help_id, counselor_id, supervisor_id, help_time, duration)
- record(record_id, help_id, sender_id, receiver_id, send_time, type, content, mark)
> 注：除binding表counselor_id和supervisor_id作为主键外，其余每个表第一个属性均为主键
