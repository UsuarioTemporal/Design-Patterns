class User(object):
    __instance = None
    def __new__(cls):
        if User.__instance is None:
            print('Nueva instancia')
            User.__instance = object.__new__(cls)
        return User.__instance

# singleton con decoradores
def singleton(cls):
    instances = dict()
    def wrap(*args,**kwargs):
        if cls not in instances :
            instances[cls] = cls(*args,**kwargs)
        return instances[cls]
    return wrap

@singleton
class Admin(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age

if __name__ == "__main__":
    user1 = User()
    print(user1)
    user2 = User()
    print(user1)
    print(user1 is user2)
    admin1 = Admin('thom',21)
    print(admin1.__dict__)
    admin2 = Admin('thom 2',21)
    print(admin2.__dict__)