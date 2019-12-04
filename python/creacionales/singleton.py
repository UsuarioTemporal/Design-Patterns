class User(object):
    __instance = None
    def __new__(cls):
        if User.__instance is None:
            print('Nueva instancia')
            User.__instance = object.__new__(cls)
        return User.__instance

user1 = User()
print(user1)
user2 = User()
print(user1)
print(user1 is user2)