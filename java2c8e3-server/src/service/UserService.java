/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import db.User;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import rmi.Login;

/**
 *
 * @author student
 */
public class UserService extends UnicastRemoteObject implements Login {
    
    private EntityManagerFactory emf;
    private Registry registry;
    
    public UserService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("java2c8e3-serverPU");
        registry = LocateRegistry.createRegistry(4444);
        registry.rebind("server", this);
    }
    
    @Override
    public boolean register(String username, String password) {
        EntityManager em = emf.createEntityManager();
        UserDao userDao = new UserDao(em);
        
        Optional<User> user = userDao.findUserByUsername(username);
        
        if (user.isPresent()) {
            return false;
        } else {
            em.getTransaction().begin();
            User dbUser = new User();
            dbUser.setUsername(username);
            dbUser.setPassword(password);
            userDao.adaugaUser(dbUser);
            em.getTransaction().commit();
            return true;
        }
    }
    
    @Override
    public boolean login(String username, String password) {
        EntityManager em = emf.createEntityManager();
        UserDao userDao = new UserDao(em);
        
        Optional<User> user = userDao.findUserByUsername(username);
        
        return password.equals(
                user.map(u -> u.getPassword())
                    .orElse(null));
            
    }
}
