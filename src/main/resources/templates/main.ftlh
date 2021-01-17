<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
<div>
    <@l.logout/>
    <span><a href="/user">User List</a> </span>
</div>
<div>
    <form method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <label><input type="text" name="text" placeholder="Введите сообщение"/></label>
        <label><input type="text" name="tag" placeholder="Тэг"></label>
        <button type="submit">Добавить</button>
    </form>
</div>
<div>Список сообщений</div>
<form method="post" action="filter">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <label><input type="text" name="filter"></label>
    <button type="submit">Найти</button>
</form>
<#list messages as message>
    <div>
        <b>${message.id}</b>
        <span>${message.text}</span>
        <i>${message.tag}</i>
        <strong>${message.authorName}</strong>
    </div>
{{/messages}}
<#else>
No messages
</#list>
</@c.page>