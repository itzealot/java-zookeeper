package com.sky.projects.zookeeper.service.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.sky.projects.zookeeper.cache.NodeCache;
import com.sky.projects.zookeeper.entity.Node;
import com.sky.projects.zookeeper.service.NodeRegisterService;

@Service("nodeRegisterService")
public class NodeRegisterServiceImpl implements NodeRegisterService {

	private static NodeCache cache = NodeCache.getNodeCache();

	@Override
	public Collection<Node> findAll() {
		return cache.getAll();
	}

	@Override
	public void add(Node node) {
		cache.add(node);
	}

	@Override
	public Collection<Node> getChildren(Node node) {
		return cache.getChildren(node);
	}

	@Override
	public Node getParent(Node node) {
		return cache.getParent(node);
	}

	@Override
	public Node getNode(String code) {
		return cache.get(code);
	}

	@Override
	public void deleteNode(Node node) {
		cache.delete(node);
	}

	@Override
	public void updateNode(Node node) {
		cache.update(node);
	}
}
