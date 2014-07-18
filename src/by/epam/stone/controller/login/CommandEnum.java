package by.epam.stone.controller.login;


public enum CommandEnum {
        LOGIN {
            {
                this.command = new LoginCommand();
            }
        },
        LOGOUT {
            {
                this.command = new LogoutCommand();
            }
        };
        ActionCommand command;
        public ActionCommand getCurrentCommand() {
            return command;
        }
    }
