USER_FRONT APPLICATION:
End to end Layers: Controller -> Service -> DAO -> Database

Steps:
- Create domain folder -> java pojo which maps to database entities
- Create resources folder -> add all static files(html, css, js)
- Create controller folder -> one controller for each functionality(page) 
Eg:  account controller for primary account, savings account, deposit, withdraw.
- Create config folder -> security config and CORS (RequestFilter)
- Create service folder -> contains interfaces of services and their ServiceImpl
- Create DAO folder -> one dao for each entity in database 
- 

Note:
- Login is handled in security config using spring secuirty.
- Thymeleaf templates are used in html pages, it assumes that the corresponding 
object exists when the page is loaded => create get method for that controller
and then post method.

ADMIN_PORTAL APPLICATION:
End to end Layers: Router -> Component -> Service -> Backend Application(USER_FRONT) 
Steps:
- Create components using Angular CLI 
- Add routes in app.routing.ts
- Add router-outlet in app.component.ts -> maps /path to the corresponding component automatically.
- For each component create a service that connects to the backend apis
- Add services in app.routing.ts
- For each method, service has corresponding method which in turn calls the corresponding backend api.


Note:
- Components subscribe for the service methods. (Observables)